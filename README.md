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
# IrcMultiClient  
IrcMultiClient is a Java Gui Program that connects 200 clients to an IRC Server and joins them to a channel named room.  
It can send/receive messages between clients and join other channels.

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

# How to use  
## Step 1
Enter IP, Port, Password , Client count
Click the Start button  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step1.png)

## Step 2
Click the View Button of any Clients.  
In this Example:  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step2.png)

## Step 3
write any command in textArea.   
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step3.png)

## Step 4
You will see the message is sent to Mary.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step4.png)

## Step 5
Check if Mary is receiving the message by clicking the View button.  
![](https://github.com/bennamrouche/ircMultiClient/blob/master/image/step5.png)
```
