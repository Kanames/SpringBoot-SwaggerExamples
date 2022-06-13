# Swagger API Info Example

In this repository I am going to show how to add ApiInfo object in your Docket so that you will have a more professional look on your Swagger UI.

My medium post here: https://medium.com/p/ef2ba65ebb86

# Getting Started

    ApiInfo is the object that allows you as a developer to add Contact information, descriptions of the API, terms of use, and other information that are less important from an implementation point of view but important from an organization point of view.

    The majority of the time teams don’t focus at all on this small details because they bring no value to the API but as mentioned they bring value from the fact that it’s a small detail that can be part of a set of small details that together makes your application more enjoyable and most of all makes you proud of your work. We can consider it in IT “Nice to have…”

Adding ***ApiInfo*** couldn’t have been easier, so I present it by a simple example you can find in the class **SpringFoxConfig.java**



First we will see how the swagger-ui looks **without** ApiInfo:

![Image of swagger-ui without ApiInfo](/SwaggerApiInfoExample/dev_resources/Swagger-UI-withoutAPI-Info.png)

So we can see that with the **ApiInfo** based on our example added a lot of new things:

<u>Point 1</u>: The **title** is now more personalized for your application, and this believe me it’s important when you manage a dozen of microservices each with their own swagger interface and you want to test them individually.

<u>Point 2</u>: We have a **description** section where we can add information that describes the point of this swagger interface or the business logic that this API’s expose.

<u>Point 3</u>: We expose an URL that can redirect the user to a main page of the developing team that manages this bundle of endpoints.

<u>Point 4</u>: We expose a way for someone to **contact us**. And this for me it’s the most important thing in an API world, you should make the effort to make the proper documentation for consumers and if that documentation is not enough then you should leave at least a way for them to contact you for a feedback.

Let’s get deeper in the details: the method ***.description()*** can be very powerful because we can add HTML code. Well actually it’s a bit fake the statement but in reality it’s called: [CommonMark syntax](https://spec.commonmark.org/) (learn it and you can do amazing stuff).
