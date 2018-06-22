package org.eclipse.xtext.example.domainmodel.ui.tests;

import org.eclipse.xtext.example.domainmodel.ui.internal.DomainmodelActivator;
import org.eclipse.xtext.example.domainmodel.ui.tests.DomainmodelUiInjectorProvider;

/**
 * @author Lorenzo Bettini - Initial contribution and API
 */
/* @RunWith(/* name is null */)
@InjectWith(DomainmodelUiInjectorProvider.class) */@SuppressWarnings("all")
public class OutlineTest /* implements AbstractOutlineTest  */{
  @Override
  protected String getEditorId() {
    return DomainmodelActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_DOMAINMODEL_DOMAINMODEL;
  }
  
  /* @Test
   */public void testOutline() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertAllLabels(String) is undefined for the type CharSequence");
  }
  
  /* @Test
   */public void testOutlineWithPackage() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertAllLabels(String) is undefined for the type CharSequence");
  }
}
