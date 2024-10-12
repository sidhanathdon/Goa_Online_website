class Payment:
    def __init__(self, payment_id, application_id, amount, payment_date, payment_status):
        self.payment_id = payment_id
        self.application_id = application_id
        self.amount = amount
        self.payment_date = payment_date
        self.payment_status = payment_status

    def make_payment(self):
        print("Payment made.")

    def get_payment_status(self):
        print(f"Payment status: {self.payment_status}")

    def generate_receipt(self):
        print("Receipt generated.")

