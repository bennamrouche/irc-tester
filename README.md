🚀 Version 2.0  

Version 2.0 is now officially released.
This update brings a redesigned interface, better performance.
## 🚀 v2 Features

✨ **Refreshed UI**  
🔢 **Flexible Client Count**  
📊 **Real-Time Data Transfer Stats**  
🧩 **Multi-Command Execution**  
📥 **Last Received Message Tracking**

![Netbeans](https://github.com/bennamrouche/ircMultiClient/assets/107180422/dfafeef3-c817-4a35-825c-e6f47ce429a7)  <b>  code build using  Netbeans IDE  </b>

<h3 align="left">Connect with me:</h3>
<p align="left">
<a href="https://linkedin.com/in/el-mehdi-bennamrouche" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="el-mehdi-bennamrouche" height="30" width="40" /></a>
<a href="https://fb.com/alphaben.dev" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="alphaben.dev" height="30" width="40" /></a>
<a href="https://instagram.com/alphaben.dev" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="alphaben.dev" height="30" width="40" /></a>
<a href="https://www.hackerrank.com/alphaben0" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/hackerrank.svg" alt="alphaben0" height="30" width="40" /></a>
<a href="https://www.leetcode.com/alphaben" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/leet-code.svg" alt="alphaben" height="30" width="40" /></a>
</p>

# 42 irc Server Tester  
### IrcMultiClient

IrcMultiClient is a Java GUI application for stress-testing IRC servers by spawning and managing multiple IRC clients.  
It connects a custom number of clients to an IRC server, auto-joins them to a default **room** channel, and allows sending/receiving messages between all clients. Additional channels can be joined dynamically.

# How to run  
## Use a Jar file
```bash
# note this jar file compile with Java 11
# use
java --version
    java 11.0.17 2022-10-18 LTS
    Java(TM) SE Runtime Environment 18.9 (build 11.0.17+10-LTS-269)
    Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.17+10-LTS-269, mixed mode)

cd dist  
java -jar IrcMulitClient.jar
```

## Use Makefile
```bash
# compile code
make build
# Run Program
make run
```
# How to Use (v2)

## Step 1
Enter the **IP**, **Port**, **Password**, and **Client Count**, then click **Start**.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step1.png)

## Step 2
Click the **View** button of any client to open its session.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step2.png)

## Step 3
Type any command in the text area and send it.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step3.png)

## Step 4
The sent message will appear in the target client window.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step4.png)

## Step 5
Check the **Main Window** to see the last received message appear automatically.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step5.png)


