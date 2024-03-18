## A demo application for spring boot
This application is a demo app, to demonetsrate using spring boot.
This app is providing api to push text and get random text from already saved texts

To get random text:
```curl
curl http://localhost:8080/api/text
```

to create random text:
```curl
curl --location 'localhost:8080/api/text' \
--header 'Content-Type: application/json' \
--data '{
    "text":"hello"
}'
```

