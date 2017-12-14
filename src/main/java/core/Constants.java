package core;

public final class Constants {
    public static class Environments {
        public static final String DEV = "http://riskmarket.ru";
    }

    public static class Browsers {
        public static final String CHROME = "chrome";
        public static final String FF = "firefox";
    }

    public enum Users {
//        TestUser("feodan@yandex.ru", "roBbfEyB");
        TestUser("feodan@mailinator.com", "bSHp4xodJYoTHlub");

        private String email;
        private String password;

        Users(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }
}
