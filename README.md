# Command Line Instructions

You can also upload existing files from your computer using the instructions below.

## Git Global Setup
```bash
git config --global user.name "[CLOUD4] 송진욱"
git config --global user.email "wlsdnr19731@gmail.com"
```bash

## Create a New Repository
```bash
git clone https://kdt-gitlab.elice.io/cloud_track/class_04/class_041/project/jinwook-java.git
cd jinwook-java
touch README.md
git add README.md
git commit -m "add README"
git push -u origin master
```bash

## Push an Existing Folder
```bash
cd existing_folder
git init
git remote add origin https://kdt-gitlab.elice.io/cloud_track/class_04/class_041/project/jinwook-java.git
git add .
git commit -m "Initial commit"
git push -u origin master
```bash

## Push an Existing Git Repository
```bash
cd existing_repo
git remote rename origin old-origin
git remote add origin https://kdt-gitlab.elice.io/cloud_track/class_04/class_041/project/jinwook-java.git
git push -u origin --all
git push -u origin --tags
```bash
