import mysql.connector

# Database Connection
#pip install mysql-connector-python
conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="college"
)

cursor = conn.cursor()

print(" Database Connected Successfully")

while True:
    print("\n--- Student Database Menu ---")
    print("1. Insert Record")
    print("2. View Records")
    print("3. Exit")

    choice = input("Enter your choice: ")

    # Insert Record
    if choice == '1':
        email = input("Enter email: ")
        name = input("Enter name: ")

        sql = "INSERT INTO student (email, name) VALUES (%s, %s)"
        values = (email, name)

        cursor.execute(sql, values)
        conn.commit()

        print("Record Inserted Successfully")

    # View Records
    elif choice == '2':
        cursor.execute("SELECT * FROM student")
        records = cursor.fetchall()

        print("\nID   email        name")
        print("------------------------")
        for row in records:
            print(row[0], " ", row[1], " ", row[2])

    # Exit
    elif choice == '3':
        print(" Program Closed")
        break

    else:
        print("Invalid Choice")

# Close Connection
cursor.close()
conn.close()
