





public class User
{
    String userType;
        String userId;
        String email;
        String passWord;
       

        User()
        {
            userType = "";
            userId= "";
            email= "";
            passWord= "";
            

        }

        public User( String userType,String userId,String email,String passWord,String lName,String fName)
        {
            this.userType = userType;
            this.userId = userId;
            this.email = email;
            this.passWord = passWord;
            
        }

        public String getUserType()
        {
            return userType;
        }
        public void setUserType(String userType)
        {
            this.userType = userType;
        }

        public String getUserId()
        {
            return userType;
        }
        public void setUserId(String userId)
        {
            this.userId = userId;
        }

        public String getEmail()
        {
            return email;
        }
        public void setEmail(String email)
        {
            this.email= email;
        }

        public String getPassword()
        {
            return passWord;
        }
        public void setPassword(String passWord)
        {
            this.passWord = passWord;
        }


        public String getFName()
        {
            return fName;
        }
        public void setFName(String firstName)
        {
            this.fName = firstName;
        }

        public String getLName()
        {
            return lName;
        }
        public void setLName(String lName)
        {
            this.lName = lName;
        }
    }

