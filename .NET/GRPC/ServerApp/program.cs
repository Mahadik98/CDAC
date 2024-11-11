using ServerApp.Services;

var builder = WebApplication.CreateBuilder(args);

// Enable gRPC services
builder.Services.AddGrpc();

var app = builder.Build();

// Map the gRPC service to the application pipeline
app.MapGrpcService<OrderManagerService>();

// Note: gRPC requires HTTP/2, so make sure Kestrel server
// is configured to support HTTP/2 in appsettings.json or in code.
// appsettings.json:
// {
//   "Kestrel": {
//     "EndpointDefaults": {
//       "Protocols": "Http2"
//     }
//   }
// }

app.Run();