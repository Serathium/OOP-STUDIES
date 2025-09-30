public class Person {
    private String name;
    private String birthDate;
    private double height;

    // Constructors
    public Person( String name, String birthDate, double height ) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setName( String name ) {
        this.name = name;
    }

    public void setBirthDate( String birthDate ) {
        this.birthDate = birthDate;
    }

    public void setHeight( double height ) {
        this.height = height;
    }

    // Other Methods
    public String sendsData() {
        return "Person's info:\nName: " + getName() + "\nBirth date: " + getBirthDate() + "\nHeight: " + getHeight() +"\n";
    }

    public short calculatesAge( String currentDate ) {
        String personDate = "", currentDateSection = "";
        short personDay = 0, personMonth = 0, personYear = 0;
        short currentDay = 0, currentMonth = 0, currentYear = 0;

        // for loop to parse the date from person and currentDate from string to short, storing the day, month and year separately 
        for( int i = 0; i < getBirthDate().length(); i++ ) {
            char personCharacter = getBirthDate().charAt(i);
            char currentDateCharacter = currentDate.charAt(i);
            personDate = personDate + personCharacter;
            currentDateSection = currentDateSection + currentDateCharacter;

            // if statement so getBirthDate().charAt(i + 1) doesn't go out of bounds
            if( i <= getBirthDate().length() - 2 ) {
                if( getBirthDate().charAt(i + 1) == '/' ) {
                    if( personDay == 0 ) {
                        personDay = Short.parseShort( personDate );
                        currentDay = Short.parseShort( currentDateSection );
                        personDate = "";
                        currentDateSection = "";
                    } else if( personMonth == 0 ) {
                        personMonth = Short.parseShort( personDate );
                        currentMonth = Short.parseShort( currentDateSection );
                        personDate = "";
                        currentDateSection = "";
                    } else {
                        personYear = Short.parseShort( personDate );
                        currentYear = Short.parseShort( currentDateSection );
                    }
                } else if( personCharacter == '/' ) {
                    personDate = "";
                    currentDateSection = "";
                }
            } else {
                if( i == getBirthDate().length() - 1 ) {
                    if( personDay == 0 ) {
                        personDay = Short.parseShort( personDate );
                        currentDay = Short.parseShort( currentDateSection );
                        personDate = "";
                        currentDateSection = "";
                    } else if( personMonth == 0 ) {
                        personMonth = Short.parseShort( personDate );
                        currentMonth = Short.parseShort( currentDateSection );
                        personDate = "";
                        currentDateSection = "";
                    } else {
                        personYear = Short.parseShort( personDate );
                        currentYear = Short.parseShort( currentDateSection );
                    }
                } else if( personCharacter == '/' ) {
                    personDate = "";
                    currentDateSection = "";
                }
            }
        }

        short personAge = ( short )(currentYear - personYear);

        if( currentMonth > personMonth ) {
            return personAge;
        } else if( currentMonth < personMonth ) {
            return ( short )( personAge - 1 );
        } else if ( currentDay > personDay ) {
            return ( short )( personAge - 1 );
        } else if ( currentDay < personDay ) {
            return personAge;
        } else { 
            return personAge;
        }
    }
    
    public static void main(String[] args) throws Exception {
        Person person1 = new Person( "Joriscleido", "29/11/2000", 1.72 );
        System.out.println( person1.getName() + "'s age: " + person1.calculatesAge( "30/09/2025" ) );
    }
}
