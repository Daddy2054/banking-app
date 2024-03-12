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
    println("You have created a $accountType accoount")
}