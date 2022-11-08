REPO_OWNER=application-research
PACKAGE_NAME=estuary-client

#set cmd to be swagger-codegen if that doesnt exist make it the java command
#swagger-codegen is supported by brew install swagger-codegen@2
#the java command is supported by the docker image swaggerapi/swagger-codegen-cli
SWAGGER=swagger-codegen
ifeq ($(shell which ${SWAGGER}),)
SWAGGER=java -jar /opt/swagger-codegen-cli/swagger-codegen-cli.jar
endif

.PHONY: all
all: $(patsubst %,%/,$(shell cat supported_langs))

swagger.json:
	curl https://raw.githubusercontent.com/${REPO_OWNER}/estuary/dev/docs/swagger.json -o $@

%-config.json: config.json.template subversion
	cat $< | \
		sed -e "s/SUBVERSION/$$(($$(cat subversion)+1))/g" | \
		sed -e "s/PACKAGE-NAME/${PACKAGE_NAME}/g" > $@

UNDERSCORE_PACKAGE_NAME=$(subst -,_,${PACKAGE_NAME})

.INTERMEDIATE: go-config.json
go-config.json: config.json.template subversion
	cat $< | \
		sed -e "s/SUBVERSION/$$(($$(cat subversion)+1))/g" | \
		sed -e "s/PACKAGE-NAME/${UNDERSCORE_PACKAGE_NAME}/g"> $@

.INTERMEDIATE: python-config.json
python-config.json: config.json.template subversion
	cat $< | \
		sed -e "s/SUBVERSION/$$(($$(cat subversion)+1))/g" | \
		sed -e "s/PACKAGE-NAME/${UNDERSCORE_PACKAGE_NAME}/g"> $@


%/: swagger.json %-config.json
	rm -rf $@ && ${SWAGGER} generate \
		-i swagger.json \
		-l $$(basename $@) \
		-o $@ \
		-c $$(basename $@)-config.json
