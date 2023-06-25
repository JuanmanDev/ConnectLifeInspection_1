// Stolen a base from: https://gist.github.com/andrebaltieri/a4c481aa02adcc0ab7ca67d2e0611cd8  
// and https://firebase.google.com/docs/web/learn-more?hl=es-419#config-object

        // TODO: Replace the following with your app's Firebase project configuration
        var firebaseConfig = {
            apiKey: "AIzaSyB-vKLh0qzwv0ddJqCmjVfa3w4q86xUbXI", // OK  resources\res\values\strings.xml
            appId: "1:99698616259:android:47e9b2e03cc15db3abbf76", // OK  resources\res\values\strings.xml
            authDomain: "auth-gateway.hijuconn.com", // FROM https://github.com/deiger/AirCon/issues/160#issuecomment-1128103516
            projectId: "connectlife-b9531", // FROM \resources\res\values\strings.xml:962
            storageBucket: "connectlife-b9531.appspot.com",// OK resources\res\values\strings.xml
            // databaseURL: "https://todos-d70a6.firebaseio.com", 
            messagingSenderId: "811053328347",
        };

        // Initialize Firebase
        firebase.initializeApp(firebaseConfig);

// https://firebase.google.com/docs/auth/web/firebaseui?hl=es_419#before_you_begin
var ui = new firebaseui.auth.AuthUI(firebase.auth());

ui.start('#firebaseui-auth-container', {
    signInOptions: [
      firebase.auth.EmailAuthProvider.PROVIDER_ID
    ],
    // Other config options...
  });