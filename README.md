# 42 IRC Server Tester

> [!WARNING]
> **Repository Archived on 2026-09-13**
> This repository is no longer actively maintained. The common core curriculum has changed, and IRC is no longer a part of it. However, I am always open to collaborating on new open-source projects or features—feel free to reach out to me!

🎥 Demo Video  

[Watch the demo](https://github.com/bennamrouche/irc-tester/blob/v2.1/image/video.webm)

## 🚀 Version 2.1

Version 2.1 is now officially released! This update brings enhanced stability, performance improvements, and a refined user experience.

### What's New in v2.1
- 🐛 **Bug Fixes**: Resolved connection stability issues
- ⚡ **Performance Enhancements**: Improved multi-client handling
- 🎨 **UI Polish**: Refined interface elements and responsiveness
- 📝 **Better Logging**: Enhanced message tracking and debugging capabilities

### v2 Series Features
✨ **Refreshed UI** - Modern, intuitive interface design  
🔢 **Flexible Client Count** - Spawn unlimited concurrent clients  
📊 **Real-Time Data Transfer Stats** - Monitor bandwidth and message rates  
🧩 **Multi-Command Execution** - Send commands to multiple clients simultaneously  
📥 **Last Received Message Tracking** - Instant message visibility in main dashboard

---

## 📖 About

IRC Tester is a powerful Java GUI application designed for stress-testing IRC servers by spawning and managing multiple concurrent IRC clients. Perfect for testing server capacity, performance, and reliability under load.

### Key Capabilities
- Connect multiple clients to any IRC server simultaneously
- Auto-join clients to a default **room** channel
- Send and receive messages between all connected clients
- Dynamically join additional channels during runtime
- Monitor real-time connection statistics and message flow

**Built with:** NetBeans IDE | **Language:** Java 17

---

## 🏃 Quick Start

### Prerequisites
- Java 17 or higher installed on your system

### Check Java Installation
```bash
java -version
# Expected output (example):
# openjdk version "17.0.17" 2023-10-21
# OpenJDK Runtime Environment (build 17.0.17+10-Ubuntu-122.04)
# OpenJDK 64-Bit Server VM (build 17.0.17+10-Ubuntu-122.04, mixed mode, sharing)
```

### Run the Application
```bash
cd bin  
java -jar irc-tester-2.1.jar
```

---

## 📘 How to Use

### Step 1: Configure Connection
Enter the following details in the main window:
- **Server IP**: IRC server address
- **Port**: Server port number (typically 6667 or 6697)
- **Password**: Server password (if required)
- **Client Count**: Number of clients to spawn

Click **Start** to initialize all clients.

### Step 2: View Client Sessions
Click the **View** button next to any client to open its individual session window.

### Step 3: Send Commands
Type IRC commands or messages in the text area and click send. Commands are executed in real-time.

### Step 4: Monitor Responses
View incoming messages in the client's session window. All IRC server responses and messages from other clients appear here.

### Step 5: Dashboard Overview
Check the **Main Window** to see:
- Connection status for all clients
- Last received message for each client
- Real-time statistics and data transfer rates

---

## 📊 Star History

[![Star History Chart](https://api.star-history.com/svg?repos=bennamrouche/irc-tester&type=Date)](https://star-history.com/#bennamrouche/irc-tester&Date)

---

## 🤝 Connect with Me
Maintained by El Mehdi Bennamrouche (aka Alphaben). Feel free to reach out if you want to collaborate, pitch features, or build new open-source project

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/el-mehdi-bennamrouche)
[![Facebook](https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white)](https://fb.com/alphaben.dev)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/alphaben.dev)
[![HackerRank](https://img.shields.io/badge/HackerRank-2EC866?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/alphaben0)
[![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://www.leetcode.com/alphaben)

---

## 📄 License

This project is open source and available under the MIT License.

## ⭐ Support

If you find this project useful, please consider giving it a star on GitHub!
