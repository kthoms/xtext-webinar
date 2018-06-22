package org.eclipse.xtext.example.domainmodel.tests;

import org.eclipse.xtext.example.domainmodel.domainmodel.DomainModel;
import org.eclipse.xtext.example.domainmodel.tests.DomainmodelInjectorProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/* @RunWith(/* name is null */)
@InjectWith(DomainmodelInjectorProvider.class) */@SuppressWarnings("all")
public class ValidationTests {
  /* @Inject */@Extension
  private /* ParseHelper<DomainModel> */Object parseHelper;
  
  /* @Inject */@Extension
  private /* ValidationTestHelper */Object validationTestHelper;
  
  /* @Test
   */public Object testImportUnused() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertWarning(Object, Object, Object) is undefined"
      + "\nThe method or field XIMPORT_DECLARATION is undefined"
      + "\nThe method or field IMPORT_UNUSED is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_1() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertWarning(Object, Object, Object) is undefined"
      + "\nThe method or field XIMPORT_DECLARATION is undefined"
      + "\nThe method or field IMPORT_UNUSED is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_2() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoIssues(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_3() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoIssues(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_4() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoIssues(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_5() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoIssues(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_6() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoIssues(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportUnused_7() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoIssues(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportDuplicate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertWarning(Object, Object, Object) is undefined"
      + "\nThe method or field XIMPORT_DECLARATION is undefined"
      + "\nThe method or field IMPORT_UNUSED is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportCollision() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertError(Object, Object, Object) is undefined"
      + "\nThe method or field XIMPORT_DECLARATION is undefined"
      + "\nThe method or field IMPORT_COLLISION is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportWildcard() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertWarning(Object, Object, Object) is undefined"
      + "\nThe method or field XIMPORT_DECLARATION is undefined"
      + "\nThe method or field IMPORT_WILDCARD_DEPRECATED is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportConflictWithTypeInSameFile() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertError(Object, Object, Object) is undefined"
      + "\nThe method or field XIMPORT_DECLARATION is undefined"
      + "\nThe method or field IMPORT_CONFLICT is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  /* @Test
   */public Object testImportNoConflictWithTypeInSameFile() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNoErrors(Object) is undefined"
      + "\nThe method parse(CharSequence) from the type ValidationTests refers to the missing type Object");
  }
  
  protected Object parse(final CharSequence modelAsText) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ValidationTests.parseHelper refers to the missing type ParseHelper"
      + "\nparse cannot be resolved");
  }
}
