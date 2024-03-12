fun main() {
    // Step 1: Start the bank system interface
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    // Step 2: Create variables for the bank account type and user input
    var accountType: String = ""
    var userChoice: Int = 0

//    Step 3: Create a bank account based on user input
// Generating user input in the while loop
    while (accountType.isEmpty()) {
        println("Choose an option (1, 2 or 3)")
        userChoice = (1..5).random()
        println("The selected option is... $userChoice")


// Defining the account type based on user input
        when (userChoice) {
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> println("Invalid choice. Please try again.")
        }
        continue
    }

    // Step 4: Display account type
    println("You have created a $accountType account")


    //part 2
    //Step 1: Create constants and variables
    var accountBalance: Int = (0..1000).random()
    println("The current balance is $accountBalance dollars.")
    val money: Int = (0..1000).random()
    println("The amount you transferred is $money dollars.")

    //Step 2: Create a test variable
    var output: Int = 0

    // Step 3: The withdrawal operation for checking and credit bank accounts
    fun withdraw (amount: Int): Int {
        accountBalance -=amount
        println("You successfully withdrew $amount. The current balance is $accountBalance dollars.")
        return amount
    }

    // Step 4: Test the withdrawal operation
    output = withdraw(money)
    println("The current balance is $accountBalance dollars.")

    //Step 5: The withdrawal operation for debit accounts
    fun debitWithdraw (amount: Int): Int {
        if (accountBalance == 0 ) {
            println("Can't withdraw, no money on this account!")
            return accountBalance
        } else if (amount > accountBalance) {
            println("Not enough money on this account! The checking balance is $accountBalance dollars.")
            return 0
        } else return withdraw(amount)
    }

    //Step 6: Test the withdrawal operation
    output = debitWithdraw(money)
    println("Test the withdrawal operation: $output")

    // Step 7: The deposit operation for checking and debit accounts
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("You deposited $amount dollars. The current balance is $accountBalance dollars.")
        return amount
    }

    // Step 8: Test the deposit operation for checking and debit accounts
    output = deposit(money)
    println("Test the deposit operation: $output")

    //Step 9: Implement the deposit operation for credit accounts
    fun creditDeposit(amount: Int): Int {
        if(accountBalance== 0){
            println("You don’t need to deposit anything in order to pay off the account since it has already been paid off.")
            return accountBalance
        } else if (accountBalance  +amount > 0) {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is ${accountBalance} dollars.")
            return 0
        } else if (accountBalance == -amount) {
            println("You deposited just enough money in order to completely pay off the account in this case.")
            return amount
        } else return deposit(amount)
    }

    // Step 10: Test the deposit operation
    output = creditDeposit(money)
    println("Test the creditDeposit operation: $output")

}