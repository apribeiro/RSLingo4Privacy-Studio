/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart#getRecipientPart <em>Recipient Part</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipientPart()
 * @model
 * @generated
 */
public interface RecipientPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Recipient Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Part</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Part</em>' reference.
   * @see #setRecipientPart(Recipient)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipientPart_RecipientPart()
   * @model
   * @generated
   */
  Recipient getRecipientPart();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart#getRecipientPart <em>Recipient Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Part</em>' reference.
   * @see #getRecipientPart()
   * @generated
   */
  void setRecipientPart(Recipient value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipientPart_Refs()
   * @model
   * @generated
   */
  EList<Recipient> getRefs();

} // RecipientPart
