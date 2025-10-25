No problem! Here's the updated README.md for your simpler version (without inheritance and abstraction):
# 🏦 Bank Management System (Java Console App)

A simple console-based banking system written in Java that demonstrates core **Object-Oriented Programming (OOP)** concepts including **Encapsulation**, **Classes & Objects**, **Constructors**, and **Methods**.

Users can log in to predefined accounts, check balances, deposit or withdraw money, and view account details through an interactive menu.

---

## ✨ Features

- 🔐 Secure login with account number and PIN
- 💰 Check balance and view detailed account information
- 📥 Deposit funds to your account
- 📤 Withdraw funds with balance validation
- 🎯 Interactive console-based menu system
- ✅ Simple and beginner-friendly code structure

---

## 🎓 OOP Concepts Demonstrated

| Concept | Implementation |
|---------|----------------|
| **Class & Objects** | `Account` class with 5 account objects |
| **Encapsulation** | Private data members (accNo, name, pin, balance) with public methods |
| **Constructor** | Parameterized constructor to initialize account objects |
| **Methods** | deposit(), withdraw(), showDetails(), checkPin() |
| **Getters** | Public methods to access private data safely |
| **Data Hiding** | PIN and balance are private, accessed through methods only |

---

## 📂 Project Structure
```
BankManagement/
│
├── Account.java          # Account class with banking operations
└── BankSystem.java       # Main program with login and menu
```

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK 8 or later)
- A terminal or IDE that can compile and run Java programs

### Installation & Run

1. **Clone the repository:**
```bash
   git clone https://github.com/hitdepani/BankManagement.git
   cd BankManagement
```

2. **Compile the Java files:**
```bash
   javac Account.java BankSystem.java
```

3. **Run the program:**
```bash
   java BankSystem
```

---

## 💻 Demo Accounts

Use these credentials to test the system:

| Account No | Name | PIN | Balance |
|------------|------|-----|---------|
| 101 | Rahul Sharma | 1234 | ₹15,000 |
| 102 | Priya Patel | 2345 | ₹25,000 |
| 103 | Amit Kumar | 3456 | ₹32,000 |
| 104 | Sneha Singh | 4567 | ₹18,000 |
| 105 | Vikram Reddy | 5678 | ₹42,000 |

---

## 📸 Sample Interaction
```
Welcome to Bank of India

--- Available Accounts ---
101 - Rahul Sharma (PIN: 1234)
102 - Priya Patel (PIN: 2345)
103 - Amit Kumar (PIN: 3456)
104 - Sneha Singh (PIN: 4567)
105 - Vikram Reddy (PIN: 5678)

Enter account number: 101
Enter PIN: 1234

Login successful!
Welcome Rahul Sharma

--- Main Menu ---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter choice: 1

--- Account Details ---
Account No: 101
Name: Rahul Sharma
Balance: Rs.15000
```

---

## ⚙️ Code Highlights

- **Encapsulation**: All account data is private and accessed through public methods
- **Constructor**: Initializes account objects with account number, name, PIN, and balance
- **Methods**: 
  - `deposit()` - Adds money to account with validation
  - `withdraw()` - Withdraws money with balance check
  - `showDetails()` - Displays account information
  - `checkPin()` - Verifies user PIN securely
- **Array of Objects**: Stores 5 hardcoded Account objects
- **Error Handling**: Validates transactions to prevent overdrafts and invalid amounts

---

## 🛠️ Technologies Used

- **Language**: Java
- **Paradigm**: Object-Oriented Programming
- **Development**: Console-based application
- **Tools**: JDK, any Java IDE or text editor

---

## 📝 Learning Outcomes

This project is ideal for understanding:
- How to create classes and objects in Java
- Implementation of encapsulation and data hiding
- Using constructors to initialize objects
- Creating methods for object behavior
- Working with arrays of objects
- Basic banking logic and transaction handling

---

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Report bugs
- Suggest new features
- Submit pull requests

---

## 👨‍💻 Author

**Hit Depani**  
📧 Email: depanihit09@gmail.com  
💼 GitHub: [@hitdepani](https://github.com/hitdepani)  
🔗 LinkedIn: [Connect with me](https://www.linkedin.com/in/hit-depani)

---

## ⭐ Show Your Support

If you found this project helpful or learned something new, please consider giving it a ⭐ on GitHub!

---

## 📄 License

This project is open source and available for educational purposes.

---

**Made with ❤️ for learning Java and OOP concepts**
