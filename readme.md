# Readme

This project tries to analise and find how works the connect life App to control Hisense Air conditioners using AEH-W4G2


# Links

https://github.com/deiger/AirCon/issues/160

# Current progress
- Decompiled Android APK on folders resources and sources (the ap is created on flutter and decompiled to java, so there are a lot of things missing)

Imported the APK on Android Studio, and be able to see the logs of the app.
The logs send info about a "flutter  callback" and "login sucess:"
Diving in the source code i fond references to a firebase type login system.


I create a basic web app to login with the data fond on the code and other help on internet.
When you put the email check if the email is registered or needs a new account and returns you need a new a account so something is wrong somwhere.


# Firebase
Is a realtime database provided by google.
It uses a lot of complexity and security things that make the progress more difficult.

Usually the clients once ther sign in, ther register to receive updated while the connection is active.
So I dont know if this make us possible to have a local only control system...

