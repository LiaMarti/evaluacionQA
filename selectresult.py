from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions  as EC
from selenium.webdriver.support.ui import Select


def get_element(navegador, referencia, tipo):
    return WebDriverWait(navegador, 10).until(
        EC.presence_of_element_located((tipo, referencia))
    )

def main():
    navegador = webdriver.Firefox()
    navegador.set_window_size(1920, 1080)

    try:
        navegador.get("https://catalog.data.gov/dataset/")

        select_search = get_element(navegador, "//*[@id="content"]/div[2]/div/section[1]/div[2]/ul/li[1]/div/h3/a", By.XPATH)
        btn_submit.click()

        time.sleep(5)
    except Exception as e:
        print("Error: ", e)
    

