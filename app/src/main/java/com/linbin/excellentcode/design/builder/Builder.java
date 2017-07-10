package com.linbin.excellentcode.design.builder;

/**
 * Created by yl1445 on 2017/7/10.
 */
public class Builder {

        private final String firstName;     // 必传参数
        private final String lastName;      // 必传参数
        private final int age;              // 可选参数
        private final String phone;         // 可选参数
        private final String address;       // 可选参数

        private Builder(UserBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.age = builder.age;
            this.phone = builder.phone;
            this.address = builder.address;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        public static class UserBuilder {
            private final String firstName;
            private final String lastName;
            private int age;
            private String phone;
            private String address;

            public UserBuilder(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public UserBuilder age(int age) {
                this.age = age;
                return this;
            }

            public UserBuilder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public UserBuilder address(String address) {
                this.address = address;
                return this;
            }

            public Builder build() {
                return new Builder(this);
            }
        }


}
