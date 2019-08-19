#!/bin/bash
echo "Enter Application Will You Kill"
read apps
#echo "Welcome $apps"

ps aux | grep $apps
