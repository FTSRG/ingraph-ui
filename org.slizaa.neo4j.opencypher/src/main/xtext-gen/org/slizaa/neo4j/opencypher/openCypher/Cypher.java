/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cypher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Cypher#getQueryOptions <em>Query Options</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Cypher#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCypher()
 * @model
 * @generated
 */
public interface Cypher extends EObject
{
  /**
   * Returns the value of the '<em><b>Query Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Options</em>' containment reference.
   * @see #setQueryOptions(QueryOptions)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCypher_QueryOptions()
   * @model containment="true"
   * @generated
   */
  QueryOptions getQueryOptions();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.Cypher#getQueryOptions <em>Query Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Options</em>' containment reference.
   * @see #getQueryOptions()
   * @generated
   */
  void setQueryOptions(QueryOptions value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getCypher_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.Cypher#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // Cypher