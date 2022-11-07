#!/bin/sh
set -euo pipefail

#download swagger.json from github and exit early if its identical to swagger.json in the repo
make -B swagger.json
git status swagger.json | grep modified && make -j -k || true
