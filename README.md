# GSM Emergency Software
### I know that this application is extremely simplistic, but to understand its role, you will need to understand that not all countries are modern and advanced. There are countries, considered from the third world, in which there is no "First Responder" system. Older people do not have the opportunity to alert a doctor or a private caregiver.
An elderly person does not have the opportunity to alert someone if they are feeling unwell or have had an accident.
Although there may be a national emergency system such as 911 or 999, the person will still need to speak and give details.

This endangers the elderly for the following reasons:
- Health does not allow him to talk on the phone or focus on using the device. (For example in case of respiratory failure or acute pain)
- The person will be confused, more than likely, and will provide incomplete or wrong information.IF he/she will be able to unlock the phone and ring the number in the first place.

Until the emergency services manage to locate the call and send someone, the victim may be dead.


I created a simple application that turns any Android phone into a panic button.
Now, if the elderly person is feeling unwell, all they have to do is tap on a lighted screen placed at hand.
The application is just a big button that once pressed sends a predefined SMS message to a certain number, in this case the personal caregiver or private health care service.
If you have a good financial situation and the vulnerable person can live in a room in your apartment, then the situation is even simpler. If something happens, and the SMS reaches you, then you know that something is serious, but the doctor has already been notified. Although you are at home with the vulnerable person, the medical alert was sent much faster than you are able to do.

Once the SMS is received, it is clear that the person's situation is not good and someone will be able to go to the elderly person as soon as possible to assess the situation and possibly provide first aid.

Due to the fact that the application uses the SIM card in the phone to send the SMS, I can't make it available in Google Play.
All you have to do to use it is to clone this project and in MainActivity to insert the text message you want to be transmitted and the phone number of the recipient in international format.
The application is full screen and prevents phone sleep or screen lock.
Just install the application on any mobile phone, as cheap as possible (minimum Android 5.1) and install it at the disposal of the vulnerable person so that it cannot be accidentally touched.
Of course you can add more phone numbers and messages to be sent.
You can add the caregiver's or doctor's number along with someone's family number.
Thus, not only the doctor or the caregiver will be alerted, but also someone close to the vulnerable person's family.

# WARNING!!
# This application uses the CREDIT available on the SIM card of the phone on which it is installed and no external API or internet connection.
Although most service providers offer free SMS nowadays, I still have to remind you that you need an active SIM, with number and credit / bundle that contains SMS.
## Hopefully you won't need to receive any SMS ...
The application looks like in the pictures below.
Feel free to adapt and modify the application according to your needs.

![N|Solid](https://i.postimg.cc/jj1z5129/LandView.png)
![N|Solid](https://i.postimg.cc/MTj1jYjG/normalview.png)


