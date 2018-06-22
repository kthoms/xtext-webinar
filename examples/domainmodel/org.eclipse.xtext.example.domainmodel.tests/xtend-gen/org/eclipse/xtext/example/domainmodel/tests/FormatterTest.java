package org.eclipse.xtext.example.domainmodel.tests;

import org.eclipse.xtext.example.domainmodel.tests.DomainmodelInjectorProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/* @RunWith(/* name is null */)
@InjectWith(DomainmodelInjectorProvider.class) */@SuppressWarnings("all")
public class FormatterTest {
  /* @Inject */@Extension
  private /* FormatterTestHelper */Object _formatterTestHelper;
  
  /**
   * This example tests if the formatted document equals the unformatted document.
   * This is the most convenient way to test a formatter.
   */
  /* @Test
   */public void example1() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertFormatted((Object)=>Object) is undefined"
      + "\nThe method toBeFormatted(String) is undefined");
  }
  
  /**
   * This example tests whether a messy document is being formatted properly.
   * In contrast to the first example, this approach also allows to test formatting strategies that are input-aware.
   * Example: "Change newLines between tokens to be one at minimum, two at maximum."
   * Here, it depends on the formatters input document whether there will be one or two newLines on the output.
   */
  /* @Test
   */public void example2() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertFormatted((Object)=>Object) is undefined"
      + "\nThe method expectation(String) is undefined"
      + "\nThe method toBeFormatted(String) is undefined");
  }
  
  /**
   * This example shows how to test property-dependent formatting behavior.
   */
  /* @Test
   */public void example3() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertFormatted((Object)=>Object) is undefined"
      + "\nThe method preferences((Object)=>Object) is undefined"
      + "\nThe method put(Object, String) is undefined"
      + "\nThe method or field FormatterPreferenceKeys is undefined"
      + "\nThe method expectation(String) is undefined"
      + "\nThe method toBeFormatted(String) is undefined"
      + "\nindentation cannot be resolved");
  }
}
