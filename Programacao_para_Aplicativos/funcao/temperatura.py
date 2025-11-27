#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

celsius = float(input("Digite a temperatura em °C: "))

def celsius_para_fahrenheit():
    return (celsius*1.8)+32

def celsius_para_kelvin():
    return celsius+273.15
    
print (celsius,"°C -->", celsius_para_fahrenheit(),"°F")
print (celsius,"°C -->", celsius_para_kelvin(),"K")