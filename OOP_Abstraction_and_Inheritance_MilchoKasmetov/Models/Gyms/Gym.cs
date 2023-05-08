using Gym.Models.Athletes;
using Gym.Models.Athletes.Contracts;
using Gym.Models.Equipment.Contracts;
using Gym.Models.Gyms.Contracts;
using Gym.Utilities.Messages;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gym.Models.Gyms
{
    public abstract class Gym : IGym
    {
        private string name;
        protected Gym(string name, int capacity)
        {
            this.Name = name;
            this.Capacity = capacity;
            this.Athletes = new List<IAthlete>();
            this.Equipment = new List<IEquipment>();
        }
        public string Name
        {
            get => name;
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException(ExceptionMessages.InvalidGymName);
                }
                name = value;
            }
        }

        public int Capacity { get; protected set; }

        public double EquipmentWeight => this.Equipment.Sum(x => x.Weight);

        public ICollection<IEquipment> Equipment { get;}

        public ICollection<IAthlete> Athletes { get;}

        public void AddAthlete(IAthlete athlete)
        {
            if (this.Athletes.Count >= this.Capacity)
            {
                throw new InvalidOperationException(ExceptionMessages.NotEnoughSize);
            }
            else
            {
                this.Athletes.Add(athlete);
            }
        }

        public void AddEquipment(IEquipment equipment) => this.Equipment.Add(equipment);

        public void Exercise()
        {
            foreach (var item in this.Athletes)
            {
                item.Exercise();
            }
        }

        public string GymInfo()
        {
            var sb = new StringBuilder();
            sb.AppendLine($"{this.Name} is a {GetType().Name}:");
            if (this.Athletes.Count == 0)
            {
                sb.AppendLine($"Athletes: No athletes");
            }
            else
            {
                sb.AppendLine($"Athletes: {String.Join(", ", this.Athletes.Select(x => x.FullName))}");
            }
            sb.AppendLine($"Equipment total count: {this.Equipment.Count}");
            sb.AppendLine($"Equipment total weight: {EquipmentWeight:f2} grams");
            return sb.ToString().TrimEnd();
        }

        public bool RemoveAthlete(IAthlete athlete) => this.Athletes.Remove(athlete);
    }
}
