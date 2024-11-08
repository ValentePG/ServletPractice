#!/bin/bash

read -p "Mensagem do commit: " -r commit

git pull origin master 

git add . 

git commit -m "$commit"

git push origin master

echo "Deu tudo certo"
