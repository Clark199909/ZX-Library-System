# ZX Library System
## Overview
This project is a desktop library management system coded in Java, utilizing JFrame and MySQL database. It contains accounts, books, and book borrowing orders management system. There are two types of accounts: administrator accounts and user accounts. After successfully signing up and logging into user accounts, users can freely search for needed books in the library and make borrow & return book requests. Once they make their requests, they will need to wait for these requests to get verified by administrators. They can see whether their requests are verified by keeping track of the status of their orders and checking emails sending from administrators once requests get handled. When logging into the administrator accounts, administrators can handle requests, manage user accounts, and edit and add book information to the library. 
## Account
### Sign Up & Log In
To sign up an account, the user needs to type in a user name, an email address, and an answer to a selected security question. After putting the email address, the user needs to verify the email by entering the code in the email that is automatically sent to the mailbox of the input email address. The system will check if the email and the user name are already in the system for the reason that each user can only have his or her unique email and user name. To sign into the account, users just need to enter their user names/email addresses and their passwords. 
### Reset Password
There are two ways to reset passwords in this application. One is through verifying the email address by entering the code in the emails sent automatically by the system, and the other is through verifying the answer to the security question. Only when the verification is done can the user's new passwords be updated to the system. 
### Account Management
Administrators have the authentication to manage user accounts. Admins can draft and send emails to any users they want to notify about information. If they find that some users fail to return books long after deadlines, they can deactivate users' accounts (they can also reactivate these accounts after users return books). 
## Book Orders
### Borrow
To borrow books, users can first search for their needed books through titles/authors/publication years/genres. Then, when they find their needed ones, they can send borrow requests and wait for admins to verify. At this time, the status of book will turn from "Available" to "Pending" and an order is created, whose status will be "Borrow Unverified." Seeing the borrow requests, admins can either verify or decline the requests. If they verify the requests, book status will turn to "Unavailable" and order status will turn to "Incomplete." If they decline, book and order statuses will become "Available" and "Declined."
### Return
To return books, users can send return requests for each book they want to return. After requests are made, book and order statuses will turn to "Pending" and "Return Unverified." Admins can also choose to verify or decline the return requests. If they verify it, book and order statuses will turn to "Available" and "Complete." If they decline, statuses will turn back to "Unavailable" and "Incomplete," and the users need to make return requests again if they want to return the books.  
## Demo
To see the demo of this desktop application, please click <a href="https://youtu.be/vXP6dhnLnj8" title="App Demo">here</a>. 
## Usage
### Setup
To use this system, users need to first download MySQL server and NetBeans IDE. The first step is to set up the database by typing "create database library;" in the MySQL client terminal. Then, it is required run the tableCreation.java file in NetBeans IDE to create the three needed tables in the project. There are also 4 .jar libraries that are needed to be downloaded and included in the library: <a href="https://dev.mysql.com/downloads/connector/j/" title="mysql connector">mysql-connector-java.jar</a>, <a href="https://javaee.github.io/javamail/" title="java mail">mail.jar</a>, <a href="https://search.maven.org/artifact/com.sun.activation/javax.activation/1.2.0/jar" title="activation">activation.jar</a>, and <a href="http://www.java2s.com/Code/Jar/c/Downloadcalendar210jar.htm" title="calendar">calendar.jar</a>. 
### Fill in email and MySQL server information in the code
Please remove placeholders and fill in information of the email address for the system to automatically send emails in src/project/Emails.java file at line 31, 45, and 58. Also, at line 20 of src/project/ConnectionProvider.java, please change "yourMySQLPassword" to the actual password of the local MySQL server password. 
### Launch application
Then, users just need to run the home.java file in src/forms directory to launch the application. 
## Testing
The testing of this application is done using JUnit Tests. These tests mainly cover functionalities of adding books, making borrow & return requests, and verifying & declining requests. For the reason that signing up & logging in require email checks, tests on the account management system are not included. When testing users' borrow and return requests, an account with user name "test" is created ahead of time to do the tests. 
## Attributions and References
### Icons
#### userHome form:
* <div>Logout Icon(“src/Images/logout.png”): Icons made by <a href="https://www.flaticon.com/authors/dmitri13" title="dmitri13">dmitri13</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
* <div>Profile Icon(“src/Images/view-details.png”): Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
* <div>Borrow Icon(“src/Images/borrow.png”): Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
* <div>Return Icon(“src/Images/return.png”): Icons made by <a href="https://www.flaticon.com/authors/pixel-perfect" title="Pixel perfect">Pixel perfect</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
* <div>Search Icon(“src/Images/search.png”): Icons made by <a href="https://www.flaticon.com/authors/good-ware" title="Good Ware">Good Ware</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
#### Home form:
* <div>User Icon(src/Images/user.png): Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
* <div>Login Icon(src/Images/log-in.png): Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
##### All forms: 
* <div>Close Icon(“src/Images/close-button.png”): Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
### Background Images
#### Login, signup, resetPassword, and resetPasswordBySecurityQuestion forms:
* <div>Background(“src/Images/background.jpg”): <a href="https://pixabay.com/photos/black-board-traces-of-chalk-school-1072366/" title="black background">Image</a> made by <a href="https://pixabay.com/users/stux-12364/" title="stux">stux</a> from <a href="https://pixabay.com/" title="pixabay">www.pixabay.com</a></div> 
#### Home form:
* <div>Home background(“src/Images/home.jpg”): <a href="https://pixabay.com/photos/old-books-book-old-library-436498/" title="books">Image</a> made by <a href="https://pixabay.com/users/jarmoluk-143740/" title="jarmoluk">jarmoluk</a> from <a href="https://pixabay.com/" title="pixabay">www.pixabay.com</a></div> 
#### userHome, userBorrow, userReturn, userProfile, and administrator forms:
* <div>User Background(“src/Images/userBackground.jpg”): <a href="https://pixabay.com/photos/library-bookshelves-ladder-1082309/" title="library">Image</a> made by <a href="https://pixabay.com/users/free-photos-242387/" title="Free-Photos">Free-Photos</a> from <a href="https://www.pixabay.com/" title="freeimages">www.pixabay.com</a></div>
#### adminManageItems, adminManageUsers, adminVerifyRequests, and adminCheckOrders forms:  
* <div>User Background(“src/Images/userBackground.jpg”): <a href="https://pixabay.com/photos/concrete-gray-wall-grunge-1646788/" title="gray background">Image</a> made by <a href="https://pixabay.com/users/predra6_photos-2182361/" title="Predra6-Photos">Predra6-Photos</a> from <a href="https://www.pixabay.com/" title="freeimages">www.pixabay.com</a></div>
### Other References:
* <div>Sending Email function: <a href="https://www.youtube.com/watch?v=BSIPHFvMjGE&t=863s" title="email">video</a> made by <a href="https://www.youtube.com/channel/UCBTuzjmeuyMkkDCSNKUxJiw" title="Bintu Harwani">Bintu Harwani</a> from <a href="https://www.youtube.com/" title="youtube">www.youtube.com</a></div>
* <div>Verify Email Format function: <a href="https://www.youtube.com/watch?v=UDxUtRdpYOY" title="verify email">video</a> made by <a href="https://www.youtube.com/channel/UC2SRL3llHF_1Rtf5x80Sd0A" title="TiMo">TiMo</a> from <a href="https://www.youtube.com/" title="youtube">www.youtube.com</a></div> 
* <div>Uploading and Fetching data to MySQL: <a href="https://www.youtube.com/watch?v=e7Izp5l6VCg" title="hotel management system netbeans">video</a> made by <a href="https://www.youtube.com/channel/UC2Dn1EkW8zglMgNkddhRVhg" title="BTech Days">BTech Days</a> from <a href="https://www.youtube.com/" title="youtube">www.youtube.com</a></div>  
