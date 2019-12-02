#!/bin/bash
Recipient="yaayyuhalaziz@gmail.com"
Subject="Greeting"
Message="Hi Self\!"
`mail -s $Subject $Recipient <<< $Message`
