
repo_owner=application-research

#set cmd to be swagger-codegen if that doesnt exist make it the java command
#swagger-codegen is supported by brew install swagger-codegen
#the java command is supported by the docker image swaggerapi/swagger-codegen-cli

cmd="swagger-codegen"
$cmd || cmd="java -jar /opt/swagger-codegen-cli/swagger-codegen-cli.jar"


swagger_url=https://raw.githubusercontent.com/$repo_owner/estuary/master/docs/swagger.json
#download swagger.json from github and exit early if its identical to swagger.json in the repo
curl $swagger_url -o swagger.json

git status swagger.json | grep modified && {
  for lang in $(cat supported_langs); do
    rm -rf $lang
    $cmd generate \
      -i $swagger_url \
      -l $lang \
      -o $lang \
      -c config.json
  done
} || true
