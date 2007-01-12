/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ibm.wala.ecore.common.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.ibm.wala.ecore.common.CommonPackage;
import com.ibm.wala.ecore.common.ECollection;
import com.ibm.wala.ecore.common.EContainer;
import com.ibm.wala.ecore.common.ENotContainer;
import com.ibm.wala.ecore.common.EObjectWithContainerId;
import com.ibm.wala.ecore.common.EPair;
import com.ibm.wala.ecore.common.ERelation;
import com.ibm.wala.ecore.common.EStringHolder;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ibm.wala.ecore.common.CommonPackage
 * @generated
 */
public class CommonSwitch {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CommonPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonSwitch() {
    if (modelPackage == null) {
      modelPackage = CommonPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public Object doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage) {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else {
      List eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch((EClass)eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case CommonPackage.ECOLLECTION: {
        ECollection eCollection = (ECollection)theEObject;
        Object result = caseECollection(eCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CommonPackage.EPAIR: {
        EPair ePair = (EPair)theEObject;
        Object result = caseEPair(ePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CommonPackage.ERELATION: {
        ERelation eRelation = (ERelation)theEObject;
        Object result = caseERelation(eRelation);
        if (result == null) result = caseEContainer(eRelation);
        if (result == null) result = caseECollection(eRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CommonPackage.ECONTAINER: {
        EContainer eContainer = (EContainer)theEObject;
        Object result = caseEContainer(eContainer);
        if (result == null) result = caseECollection(eContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CommonPackage.ENOT_CONTAINER: {
        ENotContainer eNotContainer = (ENotContainer)theEObject;
        Object result = caseENotContainer(eNotContainer);
        if (result == null) result = caseECollection(eNotContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CommonPackage.ESTRING_HOLDER: {
        EStringHolder eStringHolder = (EStringHolder)theEObject;
        Object result = caseEStringHolder(eStringHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CommonPackage.EOBJECT_WITH_CONTAINER_ID: {
        EObjectWithContainerId eObjectWithContainerId = (EObjectWithContainerId)theEObject;
        Object result = caseEObjectWithContainerId(eObjectWithContainerId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>ECollection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>ECollection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseECollection(ECollection object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EPair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EPair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEPair(EPair object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>ERelation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>ERelation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseERelation(ERelation object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EContainer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EContainer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEContainer(EContainer object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>ENot Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>ENot Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseENotContainer(ENotContainer object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EString Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EString Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEStringHolder(EStringHolder object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EObject With Container Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EObject With Container Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEObjectWithContainerId(EObjectWithContainerId object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public Object defaultCase(EObject object) {
    return null;
  }

} //CommonSwitch
