/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.CaseExpression#getCaseAlternatives <em>Case Alternatives</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.CaseExpression#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.CaseExpression#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Case Alternatives</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.opencypher.openCypher.CaseAlternatives}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Alternatives</em>' containment reference list.
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCaseExpression_CaseAlternatives()
   * @model containment="true"
   * @generated
   */
  EList<CaseAlternatives> getCaseAlternatives();

  /**
   * Returns the value of the '<em><b>Case Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Expression</em>' containment reference.
   * @see #setCaseExpression(Expression)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCaseExpression_CaseExpression()
   * @model containment="true"
   * @generated
   */
  Expression getCaseExpression();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.CaseExpression#getCaseExpression <em>Case Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Expression</em>' containment reference.
   * @see #getCaseExpression()
   * @generated
   */
  void setCaseExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expression</em>' containment reference.
   * @see #setElseExpression(Expression)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCaseExpression_ElseExpression()
   * @model containment="true"
   * @generated
   */
  Expression getElseExpression();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.CaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expression</em>' containment reference.
   * @see #getElseExpression()
   * @generated
   */
  void setElseExpression(Expression value);

} // CaseExpression
