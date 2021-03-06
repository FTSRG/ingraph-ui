/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Node Labels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ExpressionNodeLabels#getLeft <em>Left</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ExpressionNodeLabels#getNodeLabels <em>Node Labels</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getExpressionNodeLabels()
 * @model
 * @generated
 */
public interface ExpressionNodeLabels extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getExpressionNodeLabels_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.ExpressionNodeLabels#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Node Labels</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.opencypher.openCypher.NodeLabel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Labels</em>' containment reference list.
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getExpressionNodeLabels_NodeLabels()
   * @model containment="true"
   * @generated
   */
  EList<NodeLabel> getNodeLabels();

} // ExpressionNodeLabels
