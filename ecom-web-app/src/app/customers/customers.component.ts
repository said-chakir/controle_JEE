import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {CommonModule, NgIf} from "@angular/common";
import {RouterModule} from "@angular/router";
import {Router} from "@angular/router";


@Component({
  selector: 'app-customers',
  standalone: true,
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule,
    NgIf
  ],
  templateUrl: './customers.component.html',
  styleUrl: './customers.component.css'
})
export class CustomersComponent implements OnInit{

  customers: any;

  constructor(private http: HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.http.get("http://192.168.61.1:9081/api/customers").subscribe({
      next: (data) => {
        this.customers = data;
      },
      error: (err) => {
        console.error('Error fetching customers:', err);
      }
    });
  }
}
