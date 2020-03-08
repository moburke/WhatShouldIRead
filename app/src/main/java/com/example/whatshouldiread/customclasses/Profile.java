package com.example.whatshouldiread.customclasses;

/** Class that stores profile information **/

public class Profile {

    private String userName;
    private String password;
    private Book[] bookHistory;

    /*
     * Gets a string value of the user's name.
     *
     * @return userName string value of userName for class.
     */
    public String getUserName()
    {
        return userName;
    }

    /*
     * Sets a string value of the user's name.
     *
     * @param userName string value of userName.
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /*
     * Gets a string value of the user's password.
     *
     * @return password string.
     */
    public String getPassword()
    {
        return password;
    }

    /*
     * Sets a string value of the user's password.
     *
     * @param password string value of password.
     */
    public void setPassword(String password)
    {
        this.userName = password;
    }

    /*
     * Gets array of books that user has found through past questions.
     *
     * @return bookHistory array of books for this class.
     */
    public Book[] getBookHistory()
    {
        return bookHistory;
    }

}
