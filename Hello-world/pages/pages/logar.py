import time

class Home:
    def __init__(self,driver):
        self.URL = 'https://www.zoom.com.br/'
        self.driver = driver
        self.celular = 'Mi 8'
        self.senha = 'Diias@986'
        
    def go_home(self):
        self.driver.get(self.URL)

    def pesquisar_c(self):
        element = self.driver.find_element_by_xpath('//*[@id="search-field"]')
        element.send_keys(self.celular)
        element.submit()
    
    def selecionar_c(self):
        element = self.driver.find_element_by_xpath('//*[@id="storeFrontList"]/li[1]/div[1]')
        element.click()
        
        time.sleep(3)

        element = self.driver.find_element_by_xpath('//*[@id="product-list-container"]/ul/li[1]/div/div[1]/div[2]/div[3]/a')
        element.click()
        