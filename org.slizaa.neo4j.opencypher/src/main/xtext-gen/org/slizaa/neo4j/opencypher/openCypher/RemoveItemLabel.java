/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Item Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.RemoveItemLabel#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.RemoveItemLabel#getNodeLabels <em>Node Labels</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRemoveItemLabel()
 * @model
 * @generated
 */
public interface RemoveItemLabel extends RemoveItem
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRemoveItemLabel_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.RemoveItemLabel#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Node Labels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Labels</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Labels</em>' containment reference.
   * @see #setNodeLabels(NodeLabels)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRemoveItemLabel_NodeLabels()
   * @model containment="true"
   * @generated
   */
  NodeLabels getNodeLabels();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.RemoveItemLabel#getNodeLabels <em>Node Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Labels</em>' containment reference.
   * @see #getNodeLabels()
   * @generated
   */
  void setNodeLabels(NodeLabels value);

} // RemoveItemLabel