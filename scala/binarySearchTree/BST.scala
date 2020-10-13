package practice.binarySearchTree

class BST(var root: TreeNode = null) {
  /**
   * adds a node to the BST
   * @param nodeValue value of node to be added
   */
  def addNode(nodeValue: Int): Unit = {
    if (root == null) {
      root = new TreeNode(nodeValue)
      return
    }
    var temp: TreeNode = root
    while (true) {
      if (nodeValue <= temp.value) {
        if (temp.left == null) {
          temp.left = new TreeNode(nodeValue)
          return
        }
        temp = temp.left
      } else {
        if (temp.right == null) {
          temp.right = new TreeNode(nodeValue)
          return
        }
        temp = temp.right
      }
    }
  }

  /**
   * searches a node in the BST
   * @param value value to be searched
   * @return true if the node with value is present in th BST, else returns false
   */
  def searchBst(value: Int) : Boolean = {
    // TODO
    false
  }

  /**
   * deletes a node from the BST
   * @param nodeValue value of the node to be deleted
   * @return true if a node with value is deleted, returns false if the node with this value is not present
   */
  def deleteNode(nodeValue: Int) : Boolean = {
    // TODO
    false
  }

  /**
   * prints the in-order traversal of the BST
   */
  def printInOrderTraversal(): Unit = {
    print("In-order traversal : ")
    inOrderTraversal(root)
    println()
  }

  /**
   * prints the pre-order traversal of the BST
   */
  def printPreOrderTraversal(): Unit = {
    print("Pre-order traversal : ")
    preOrderTraversal(root)
    println()
  }

  /**
   * prints the post-order traversal of the BST
   */
  def printPostOrderTraversal(): Unit = {
    print("Post-order traversal : ")
    postOrderTraversal(root)
    println()
  }

  /**
   * prints the level order traversal of the BST
   */
  def printLevelOrderTraversal(): Unit = {
    // TODO: implement the method
  }

  /**
   * prints the pre-order traversal starting from node
   * @param node root node of the tree
   */
  private def preOrderTraversal(node: TreeNode): Unit = {
    if (node == null)
      return
    print(s"${node.value} ")
    preOrderTraversal(node.left)
    preOrderTraversal(node.right)
  }

  /**
   * prints the post-order traversal starting from node
   * @param node root node of the tree
   */
  private def postOrderTraversal(node: TreeNode): Unit = {
    if (node == null)
      return
    postOrderTraversal(node.left)
    postOrderTraversal(node.right)
    print(s"${node.value} ")
  }

  /**
   * prints the in-order traversal starting from node
   * @param node root node of the tree
   */
  private def inOrderTraversal(node: TreeNode): Unit = {
    if (node == null)
      return
    inOrderTraversal(node.left)
    print(s"${node.value} ")
    inOrderTraversal(node.right)
  }

}
