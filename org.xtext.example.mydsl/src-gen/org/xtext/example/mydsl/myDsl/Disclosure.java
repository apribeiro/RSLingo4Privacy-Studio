/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disclosure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getPartof <em>Partof</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipient <em>Refer To Recipient</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipientsource <em>Refer To Recipientsource</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getRefprivatedata <em>Refprivatedata</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Disclosure#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure()
 * @model
 * @generated
 */
public interface Disclosure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Disclosure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Disclosure#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Disclosure#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partof</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partof</em>' reference.
   * @see #setPartof(Disclosure)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Partof()
   * @model
   * @generated
   */
  Disclosure getPartof();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Disclosure#getPartof <em>Partof</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partof</em>' reference.
   * @see #getPartof()
   * @generated
   */
  void setPartof(Disclosure value);

  /**
   * Returns the value of the '<em><b>Refer To Recipient</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ReferToRecipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To Recipient</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To Recipient</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_ReferToRecipient()
   * @model containment="true"
   * @generated
   */
  EList<ReferToRecipient> getReferToRecipient();

  /**
   * Returns the value of the '<em><b>Refer To Recipientsource</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ReferToRecipientSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To Recipientsource</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To Recipientsource</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_ReferToRecipientsource()
   * @model containment="true"
   * @generated
   */
  EList<ReferToRecipientSource> getReferToRecipientsource();

  /**
   * Returns the value of the '<em><b>Refer To Recipienttarget</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ReferToRecipientTarget}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To Recipienttarget</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To Recipienttarget</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_ReferToRecipienttarget()
   * @model containment="true"
   * @generated
   */
  EList<ReferToRecipientTarget> getReferToRecipienttarget();

  /**
   * Returns the value of the '<em><b>Refprivatedata</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RefPrivateData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refprivatedata</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refprivatedata</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Refprivatedata()
   * @model containment="true"
   * @generated
   */
  EList<RefPrivateData> getRefprivatedata();

  /**
   * Returns the value of the '<em><b>Refertoservice</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ReferToService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertoservice</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertoservice</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Refertoservice()
   * @model containment="true"
   * @generated
   */
  EList<ReferToService> getRefertoservice();

  /**
   * Returns the value of the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RefertoEnforcement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referto Enforcement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referto Enforcement</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_RefertoEnforcement()
   * @model containment="true"
   * @generated
   */
  EList<RefertoEnforcement> getRefertoEnforcement();

  /**
   * Returns the value of the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modalitykind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modalitykind</em>' attribute.
   * @see #setModalitykind(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDisclosure_Modalitykind()
   * @model
   * @generated
   */
  String getModalitykind();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Disclosure#getModalitykind <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modalitykind</em>' attribute.
   * @see #getModalitykind()
   * @generated
   */
  void setModalitykind(String value);

} // Disclosure