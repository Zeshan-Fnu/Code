# class Product:
#     def __init__(self, name, quantity):
#         self.name = name
#         self.quantity = quantity
#     def modifyQuantity(self, newQuantity):
#         self.quantity = newQuantity

# shirt = Product('shirt',10)
# pant = Product('pant',25)

# print(shirt.name + ' ' + str(shirt.quantity))
# shirt.modifyQuantity(20)
# print(shirt.name + ' ' + str(shirt.quantity))

from docx import Document

document = Document()

document.save('cv.docx')

 
