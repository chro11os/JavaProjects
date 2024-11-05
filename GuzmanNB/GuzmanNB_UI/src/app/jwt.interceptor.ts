import { HttpInterceptorFn } from '@angular/common/http';

export const jwtInterceptor: HttpInterceptorFn = (req, next) => {
  // Retrieve the token from localStorage or any other storage you are using
  const token = localStorage.getItem('jwtToken');

  // Check if the token exists and add it to the Authorization header
  if (token) {
    req = req.clone({
      setHeaders: {
        Authorization: `Bearer ${token}`
      }
    });
  }

  // Pass the modified request to the next handler
  return next(req);
};
