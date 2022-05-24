# MAD Practical 6 - Storage
Continuing from previous weeks, you might have observed that the values generated and changes made by users are not saved. This week, you will be adding persistant storage to your app. <br/>
Follow the instructions below to complete your app.

1. Create your db handler class extending `SQLiteOpenHelper`. This class will create a new database upon initialization. There is a `User` table, whose structure follows the `User` class diagram. During the initialization, 20 `User` data are generated and inserted into the table. The `name`, `description` and value of `followed` are randomized, the value of `id` is an auto-increment primary key.

<img width="137" alt="user_cd" src="https://user-images.githubusercontent.com/31364147/114372223-e21dff00-9bb3-11eb-80fe-28d712cbc170.png">
<img width="698" alt="p6_db" src="https://user-images.githubusercontent.com/31364147/114372212-e0543b80-9bb3-11eb-9dec-092610bb346d.PNG">

2.	Create a `getUsers()` function in your db handler. This function will returns all the user information from the database as a List. 

    Modify your `RecyclerView` so that it is pre-populated with information from the database only.

3.	Create a `updateUser()` function in your db handler. This function will receive a `User` object and update the corresponding value in the database.

    Modify your `MainActivity` so that it calls this function to update the database every time the Follow/Unfollow button is clicked.

4.	If all the above have been modified successfully, changes made to the user profile will be saved persistently. Test your app to verify this behaviour.

5.	Remove the `intent-filter` for the `MainActivity` from the `manifest`. This will allow the user to launch your app via the `ListActivity` only.

# CHALLENGE
The SQL database created in the mobile app is local to the device and the app. It is
also known as a device database. This database is a simple relational database
that is only specifically accessible by local device that it is with. In mobile
app development, most of the time the preference is a remote database for
storage. This allows accessibility for multiple connected devices and 
designed a seamless multiple-device single-user experience. 

For this, integrate Firebase Realtime Database to your android app.

Read the following information on Firebase before attempting this development.

Setup and add Firebase to your Android Project:
https://firebase.google.com/docs/android/setup

Documentation for adding Firebase to Android and sample code:
https://firebase.google.com/docs/database/android/start

6. Create a simple login page. 
<img width="216px" alt="6" src="https://user-images.githubusercontent.com/31364147/169678737-4d661e89-7b61-4f6c-aca6-54a98a2cb118.png">

7. Create a Firebase account, create and populate the Realtime database as follows:
<img width="475" alt="7" src="https://user-images.githubusercontent.com/31364147/169678741-47226a23-9d47-4e4a-84c7-38d1fe6b5fdd.png">

8. Connect the login page to the Firebase remotely in your app.
<img width="375" alt="8" src="https://user-images.githubusercontent.com/31364147/169678747-c46abc55-7bbc-4aaa-87f1-4c13939de0ae.PNG">

9. Allow the user to login to the `ListActivity` if the username and password are correct.
