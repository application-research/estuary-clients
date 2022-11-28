#!/bin/sh
set -euo pipefail


apk add make || true # can remove when https://github.com/application-research/estuary/blob/master/.github/workflows/swagger-client.yml is updated

#download swagger.json from github and exit early if its identical to swagger.json in the repo
make -B swagger.json
git status swagger.json | grep modified && make -j -k -B || true

cp -rv file_overrides/* .

#increment subversion by 1
subversion=$(cat subversion)
subversion=$((subversion+1))
echo $subversion > subversion

