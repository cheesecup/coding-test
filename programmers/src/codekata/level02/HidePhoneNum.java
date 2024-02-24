package codekata.level02;

/* 휴대폰 번호 가리기 */
class HidePhoneNum {
    public String solution(String phone_number) {
        return phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*")
                + phone_number.substring(phone_number.length() - 4);
    }
}
