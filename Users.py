class Xrhsths:
    def __init__(self, username, password, email, id, announcement_feed):
        self.username = username
        self.password = password
        self.email = email
        self.id = id
        self.announcement_feed = announcement_feed

    def viewFeed(self):
        x = self.announcement_feed
        print(x)
print("test")