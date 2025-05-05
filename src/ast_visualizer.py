from anytree import Node, RenderTree
from anytree.exporter import DotExporter
from graphviz import Source

# Definição da classe ASTNode usando anytree
class ASTNode(Node):
    pass

# Classe para visualização da árvore AST
class ASTVisualizer:
    def __init__(self):
        self.node_count = 0

    # Método para criar um nó na árvore
    def create_node(self, label, parent=None):
        node = ASTNode(f"Node_{self.node_count}: {label}", parent=parent)
        self.node_count += 1
        return node

    # Método para renderizar a árvore no terminal
    def render(self, root):
        for pre, fill, node in RenderTree(root):
            print(f"{pre}{node.name}")

    # Método para exportar a árvore para um arquivo DOT
    def export_to_dot(self, root, output_path="ast.dot"):
        DotExporter(root).to_dotfile(output_path)
        print(f"AST exportada para {output_path}.")

    # Método para gerar a imagem PNG usando o Graphviz
    def generate_png(self, dot_file, output_image="ast.png"):
        try:
            # Usando o Graphviz para gerar a imagem PNG a partir do arquivo .dot
            source = Source.from_file(dot_file)
            source.render(output_image, format='png', cleanup=True)
            print(f"Imagem gerada: {output_image}")
        except Exception as e:
            print(f"Erro ao gerar a imagem PNG: {e}")