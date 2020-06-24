repo_root=$( git rev-parse --show-toplevel )
cd $repo_root

cp ./sh-utils/pre-commit ./.git/hooks/
