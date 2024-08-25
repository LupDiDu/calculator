package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calculator extends BasePage {

    @FindBy(id = "digit_0")
    private WebElement digit_0;
    @FindBy(id = "digit_1")
    private WebElement digit_1;
    @FindBy(id = "digit_2")
    private WebElement digit_2;
    @FindBy(id = "digit_3")
    private WebElement digit_3;
    @FindBy(id = "digit_4")
    private WebElement digit_4;
    @FindBy(id = "digit_5")
    private WebElement digit_5;
    @FindBy(id = "digit_6")
    private WebElement digit_6;
    @FindBy(id = "digit_7")
    private WebElement digit_7;
    @FindBy(id = "digit_8")
    private WebElement digit_8;
    @FindBy(id = "digit_9")
    private WebElement digit_9;
    @FindBy(id = "op_add")
    private WebElement add;
    @FindBy(id = "op_sub")
    private WebElement subtract;
    @FindBy(id = "op_mul")
    private WebElement multiply;
    @FindBy(id = "op_div")
    private WebElement divide;
    @FindBy(id = "eq")
    private WebElement equals_;

    public Calculator(AndroidDriver driver) {
        super(driver);
    }

    public void calculate(String expression) {
        StringBuilder number = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                clickNumber(number.toString());
                number.setLength(0); // Очистка строки для следующего числа

                switch (c) {
                    case '+':
                        click_add();
                        break;
                    case '-':
                        click_sub();
                        break;
                    case '*':
                        click_multi();
                        break;
                    case '/':
                        click_div();
                        break;
                    default:
                        throw new IllegalArgumentException("Неподдерживаемый оператор: " + c);
                }
            }
        }
        if (number.length() > 0) clickNumber(number.toString());
        click_eq();
    }

    private void clickNumber(String number) {
        for (char digit : number.toCharArray()) {
            switch (digit) {
                case '0':
                    click_0();
                    break;
                case '1':
                    click_1();
                    break;
                case '2':
                    click_2();
                    break;
                case '3':
                    click_3();
                    break;
                case '4':
                    click_4();
                    break;
                case '5':
                    click_5();
                    break;
                case '6':
                    click_6();
                    break;
                case '7':
                    click_7();
                    break;
                case '8':
                    click_8();
                    break;
                case '9':
                    click_9();
                    break;
                default:
                    throw new IllegalArgumentException("Не валидные данные: " + digit);
            }
        }
    }

    public Calculator click_0() {
        digit_0.click();
        return this;
    }

    public Calculator click_1() {
        digit_1.click();
        return this;
    }

    public Calculator click_2() {
        digit_2.click();
        return this;
    }

    public Calculator click_3() {
        digit_3.click();
        return this;
    }

    public Calculator click_4() {
        digit_4.click();
        return this;
    }

    public Calculator click_5() {
        digit_5.click();
        return this;
    }

    public Calculator click_6() {
        digit_6.click();
        return this;
    }

    public Calculator click_7() {
        digit_7.click();
        return this;
    }

    public Calculator click_8() {
        digit_8.click();
        return this;
    }

    public Calculator click_9() {
        digit_9.click();
        return this;
    }

    public Calculator click_add() {
        add.click();
        return this;
    }

    public Calculator click_sub() {
        subtract.click();
        return this;
    }

    public Calculator click_multi() {
        multiply.click();
        return this;
    }

    public Calculator click_div() {
        divide.click();
        return this;
    }

    public Calculator click_eq() {
        equals_.click();
        return this;
    }
}