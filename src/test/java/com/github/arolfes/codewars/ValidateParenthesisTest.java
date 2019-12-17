package com.github.arolfes.codewars;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ValidateParenthesisTest {

  @Test
  public void testValidate() throws Exception {
    assertThat(ValidateParenthesis.validate("{([a+3])+c+[(b-3)]}"), is(true));
    assertThat(ValidateParenthesis.validate("(a+2+[c+4]+{2+3+(1+d)})"), is(true));
    assertThat(ValidateParenthesis.validate("c+5("), is(false));
    assertThat(ValidateParenthesis.validate("c+5)"), is(false));
    assertThat(ValidateParenthesis.validate("c+5+(b-3+[2+a)+3]"), is(false));
  }

}
