            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("First Name: "); String fn = sc.nextLine();
                    System.out.print("Last Name: "); String ln = sc.nextLine();
                    System.out.print("Street: "); String street = sc.nextLine();
                    System.out.print("City: "); String city = sc.nextLine();
                    System.out.print("State: "); String state = sc.nextLine();
                    System.out.print("ZIP: "); String zip = sc.nextLine();
                    System.out.print("Birth Month: "); int m = sc.nextInt();
                    System.out.print("Birth Day: "); int d = sc.nextInt();
                    System.out.print("Birth Year: "); int y = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Phone: "); String phone = sc.nextLine();
                    System.out.print("Category (Family/Friend/Business): "); String cat = sc.nextLine();
                    ExtPerson p = new ExtPerson(fn, ln, street, city, state, zip, m, d, y, phone, cat);
                    book.addEntry(p);
                    break;
                case 2:
                    System.out.print("Enter Last Name: ");
                    book.searchByLastName(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter Last Name to delete: ");
                    book.deleteByLastName(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Full Name: ");
                    book.printDetailsByName(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter Month: ");
                    int month = sc.nextInt();
                    System.out.print("Enter Start Day: ");
                    int startDay = sc.nextInt();
                    System.out.print("Enter End Day: ");
                    int endDay = sc.nextInt();
                    sc.nextLine();
                    book.printBirthdaysInMonth(month, startDay, endDay);
                    break;
                case 6:
                    System.out.print("Enter Starting Last Name: ");
                    String start = sc.nextLine();
                    System.out.print("Enter Ending Last Name: ");
                    String end = sc.nextLine();
                    book.printNamesBetweenLastNames(start, end);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
