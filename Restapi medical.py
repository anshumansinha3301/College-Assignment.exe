import requests

def getAverageTemperatureForUser(userId):
    total_temp = 0.0
    count = 0
    page = 1

    while True:
        url = f"https://jsonmock.hackerrank.com/api/medical_records?userId={userId}&page={page}"
        response = requests.get(url).json()

        data = response.get("data", [])
        if not data:
            break

        for record in data:
            vitals = record.get("vitals", {})
            if "bodyTemperature" in vitals:
                total_temp += vitals["bodyTemperature"]
                count += 1

        if page >= response.get("total_pages", 0):
            break

        page += 1

    if count == 0:
        return "0"

    average = total_temp / count
    return f"{average:.1f}"
