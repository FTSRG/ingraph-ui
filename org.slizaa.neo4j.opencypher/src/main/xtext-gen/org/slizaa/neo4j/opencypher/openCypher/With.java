/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.With#isDistint <em>Distint</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.With#getReturnBody <em>Return Body</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.With#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getWith()
 * @model
 * @generated
 */
public interface With extends Clause
{
  /**
   * Returns the value of the '<em><b>Distint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distint</em>' attribute.
   * @see #setDistint(boolean)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getWith_Distint()
   * @model
   * @generated
   */
  boolean isDistint();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.With#isDistint <em>Distint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distint</em>' attribute.
   * @see #isDistint()
   * @generated
   */
  void setDistint(boolean value);

  /**
   * Returns the value of the '<em><b>Return Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Body</em>' containment reference.
   * @see #setReturnBody(ReturnBody)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getWith_ReturnBody()
   * @model containment="true"
   * @generated
   */
  ReturnBody getReturnBody();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.With#getReturnBody <em>Return Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Body</em>' containment reference.
   * @see #getReturnBody()
   * @generated
   */
  void setReturnBody(ReturnBody value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getWith_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.With#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

} // With
